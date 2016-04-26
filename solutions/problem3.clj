(ns euler
  (:use [clojure.contrib.math :only (sqrt)]))

(def num 600851475143)

(defn prime? [n]
      (.isProbablePrime (BigInteger/valueOf n) 5))

(def primes (filter prime? (range 1 num))) 

(defn problem-3 []
  (reduce max 
    (filter #(zero? (mod num %))
      (take-while #(< % (sqrt num)) primes))))
