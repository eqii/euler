(ns euler)

(defn fibonacci-seq []
  (map first (iterate (fn [[a b]] [b (+' a b)]) [1 2])))

(defn exp [x n]
  (reduce * (repeat n x)))

(defn problem-2 []
  (->> (fibonacci-seq)
       (take-while (fn [x] (< x (* 4 (exp 10 6)))))
       (filter even?)
       (reduce +)))