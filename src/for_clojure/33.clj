(ns for-clojure.33)

(defn duplicate-a-sequence
  "Write a function which replicates each element of a sequence a variable number of times.\n\n
  https://4clojure.oxal.org/#/problem/33"
  [coll n]
  (apply concat (map (fn [item] (repeat n item)) coll)))


(println (= (duplicate-a-sequence [1 2 3] 2) '(1 1 2 2 3 3)))

(println (= (duplicate-a-sequence [:a :b] 4) '(:a :a :a :a :b :b :b :b)))

(println (= (duplicate-a-sequence [4 5 6] 1) '(4 5 6)))

(println (= (duplicate-a-sequence [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4])))

(println (= (duplicate-a-sequence [44 33] 2) [44 44 33 33]))


