(ns euler004.core)

(defn products-up-to
  [n]
  (let [n (inc n)]
    (for [a (range 1 n)
          b (range 1 n)
          :when (<= a b)]
      (* a b))))
