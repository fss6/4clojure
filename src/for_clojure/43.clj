(ns for-clojure.43)


(defn reverse-interleave
  "Write a function which reverses the interleave process into x
  number of subsequences.
  - https://4clojure.oxal.org/#/problem/43"
  [coll, n]
  (apply map vector (partition-all n coll)))

(println (= (reverse-interleave [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6))))

(println (= (reverse-interleave (range 9) 3) '((0 3 6) (1 4 7) (2 5 8))))

(println (= (reverse-interleave (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9))))



