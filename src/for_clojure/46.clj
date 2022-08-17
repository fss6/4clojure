(ns for-clojure.46)

(defn hof
  "Write a higher-order function which flips the order of the arguments of an input function.\n\n.
  - https://4clojure.oxal.org/#/problem/46"
  [f]
  #(f %2 %1))


(println (= 3 ((hof nth) 2 [1 2 3 4 5])))

(println (= true ((hof >) 7 8)))

(println (= 4 ((hof quot) 2 8)))

(println (= [1 2 3] ((hof take) [1 2 3 4 5] 3)))

