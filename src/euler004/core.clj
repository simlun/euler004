(ns euler004.core)

(defn cartesian-product
  [a b]
  (for [x (seq a)
        y (seq b)]
    [x y]))

(defn unique-seq
  [coll]
  (seq (set coll)))

(defn unique-vec
  [coll]
  (vec (set coll)))

(defn multiply-pairs
  [coll-of-pairs]
  (map #(* (first %) (second %)) coll-of-pairs))

(defn products-up-to
  [n]
  (let [integers-up-to-n (range 1 (inc n))
        pairs (cartesian-product integers-up-to-n integers-up-to-n)]
    (unique-seq (multiply-pairs pairs))))

