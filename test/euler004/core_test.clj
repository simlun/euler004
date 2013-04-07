(ns euler004.core-test
  (:use midje.sweet
        euler004.core))

(fact
  (+ 1 1) => 2)

(facts
  (integer-products-up-to 2) => [1 2 4]
  (integer-products-up-to 3) => [1 2 3 4 6 9])

(fact "A bad implementation might contain both 1*4 and 2*2"
  (integer-products-up-to 4) =not=> (contains [4 4] :gaps-ok))

(fact
  (integer-products-up-to 4) => [1 2 3 4 6 8 9 12 16])

(fact
  (cartesian-product [1 2] [3 4]) => [[1 3] [1 4] [2 3] [2 4]])

(facts
  (palindrome? 11) => true
  (palindrome? 111) => true
  (palindrome? 9910199) => true
  (palindrome? 10) => false
  (palindrome? 100) => false)

