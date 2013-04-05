(ns euler004.core
  (:gen-class))

(defn cartesian-product
  [a b]
  (for [x (seq a)
        y (seq b)]
    [x y]))

(defn unique-seq
  [coll]
  (seq (set coll)))

(defn multiply-pairs
  [coll-of-pairs]
  (map #(* (first %) (second %)) coll-of-pairs))

(defn products-up-to
  [n]
  (let [integers-up-to-n (range 1 (inc n))
        pairs (cartesian-product integers-up-to-n integers-up-to-n)]
    (unique-seq (multiply-pairs pairs))))

(defn integer-to-list
  [integer]
  (loop [integer-to-explode integer
         digits ()]
    (let [next-integer-to-explode (unchecked-divide-int integer-to-explode 10)
          next-digits (conj digits (unchecked-remainder-int integer-to-explode 10))]
      (if (= next-integer-to-explode 0)
        next-digits
        (recur next-integer-to-explode next-digits)))))

(defn palindrome?
  [n]
  (let [n-list (integer-to-list n)
        n-vector (vec n-list)]
    (= n-vector (reverse n-vector))))

(defn solve
  []
  (apply max (filter palindrome? (products-up-to 999))))

(defn -main
  [& args]
  (println (solve)))

