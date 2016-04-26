(ns euler)

(defn divisible-by [n]
  (reduce + (range n 1000 n)))

(defn problem-1 []
  (- (+ (divisible-by 3) (divisible-by 5)) (divisible-by 15)))