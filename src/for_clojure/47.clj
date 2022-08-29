(ns for-clojure.47)

"The contains? function checks if a KEY is present in a given collection.
This often leads beginner clojurians to use it incorrectly with numerically
indexed collections like vectors and lists.
- https://4clojure.oxal.org/#/problem/47"
(def k 4)


(println (contains? #{4 5 6} k))
(println (contains? [1 1 1 1 1] k))
(println (contains? {4 :a 2 :b} k))
(println (not (contains? [1 2 4] k)))

