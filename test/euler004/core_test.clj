(ns euler004.core-test
  (:use midje.sweet
        euler004.core))

(fact
  (+ 1 1) => 2)

(fact
  (products-up-to 2) => [1 2 4]
  (products-up-to 3) => [1 2 3 4 6 9])

(future-fact
  (products-up-to 4) => [1 2 3 4 6 9 12 16])
