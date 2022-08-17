(ns for-clojure.44)

(defn rotate-sequence
  "Write a function which can rotate a sequence in either direction.\n\n.
  - https://4clojure.oxal.org/#/problem/44"
  [n, coll]
  (let [amount (count coll)]
    (if (>= n 0)
      (let [m (if (<= n amount) n (- n amount))]
        (concat (drop m coll) (take m coll)))
      (recur (+ amount n) coll))))


(println (= (rotate-sequence 2 [1 2 3 4 5]) '(3 4 5 1 2)))

(println (= (rotate-sequence -2 [1 2 3 4 5]) '(4 5 1 2 3)))

(println (= (rotate-sequence 6 [1 2 3 4 5]) '(2 3 4 5 1)))

(println (= (rotate-sequence 1 '(:a :b :c)) '(:b :c :a)))

(println (= (rotate-sequence -4 '(:a :b :c)) '(:c :a :b)))

