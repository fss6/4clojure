(ns for-clojure.51)

"Here is an example of some more sophisticated destructuring.
- https://4clojure.oxal.org/#/problem/51"

(def C1 '(1 2 3 4 5))

(println (= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] C1] [a b c d])))


