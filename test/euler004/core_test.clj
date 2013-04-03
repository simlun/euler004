(ns euler004.core-test
  (:use midje.sweet
        euler004.core))

(fact
  (+ 1 1) => 2)

(fact
  (products-up-to 2) => [1 2 4]
  (products-up-to 3) => [1 2 3 4 6 9])

(fact "A bad implementation might contain both 1*4 and 2*2"
  (products-up-to 4) =not=> (contains [4 4] :gaps-ok))

(fact
  (products-up-to 4) => [1 2 3 4 6 8 9 12 16])

(fact
  (cartesian-product [1 2] [3 4]) => [[1 3] [1 4] [2 3] [2 4]])

(future-fact "Input must be of same sizes"
  (cartesian-product [1 2 3] [4 5] => (throws Exception))
  )

(fact
  (unique-seq [1 2 3]) => [1 2 3]
  (unique-seq [1 2 2 3]) => [1 2 3])

