(ns euler)

(defn is-palindrome? [num]
  (let [num-seq (seq (str num))]
    (= num-seq (reverse num-seq))))

(defn problem-4 []
  (let [combinations (for [a (range 100 999) 
                           b (range 100 999) 
                           :when (>= a b)] 
                       (* a b))]
    (apply max (filter is-palindrome? combinations))))