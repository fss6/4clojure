(ns for-clojure.48)

"The some function takes a predicate function and a collection.
It returns the first logical true value of (predicate x) where x is an item in the collection.\n\n
- https://4clojure.oxal.org/#/problem/48"
(def k 6)


(println (= k (some #{2 7 6} [5 6 7 8])))

(println (= k (some #(when (even? %) %) [5 6 7 8])))

