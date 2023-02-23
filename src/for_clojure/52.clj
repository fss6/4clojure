(ns for-clojure.52)

"Let bindings and function parameter lists support destructuring.\n\n
- https://4clojure.oxal.org/#/problem/52"


(println (= [2 4] (let [[a b c d e f g] (range)] [c e])))


