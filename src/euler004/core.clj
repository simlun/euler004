(ns euler004.core
  (:use [euler074.core :only [integer-to-list]])
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

(defn integer-products-up-to
  [n]
  (let [integers-up-to-n (range 1 (inc n))
        pairs (cartesian-product integers-up-to-n integers-up-to-n)]
    (unique-seq (multiply-pairs pairs))))

(defn palindrome?
  [n]
  (let [n-list (integer-to-list n)
        n-vector (vec n-list)]
    (= n-vector (reverse n-vector))))

(defn solve
  []
  (apply max (filter palindrome? (integer-products-up-to 999))))

(defn -main
  [& args]
  (println (solve)))

