(ns euler)

(defn square [x]
  (* x x))

(defn problem-6 []
  (let [numbers (range 1 101)]
    (- (square (reduce + numbers)) (reduce + (map square numbers)))))