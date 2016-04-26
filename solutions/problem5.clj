(ns euler)

(defn gcd [a b]
  (if (zero? b)
    a
    (recur b (mod a b))))

(defn lcd [a b]
   (quot (* a b) (gcd a b)))

(defn problem-5 []
  (reduce lcd (range 1 21)))