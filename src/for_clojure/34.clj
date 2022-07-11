(ns for-clojure.34)

(defn my-range
  "Write a function which creates a list of all integers in a given range.\n\n
  - Special Restrictions : range.\n\n
  https://4clojure.oxal.org/#/problem/34"
  [initial limit]
  (->> initial
       (iterate inc)
       (take (* (- initial limit) -1))))

(println (= (my-range 1 4) '(1 2 3)))
(println (= (my-range -2 2) '(-2 -1 0 1)))
(println (= (my-range 5 8) '(5 6 7)))