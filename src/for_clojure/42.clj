(ns for-clojure.42)

(defn factorial-fun
  "Write a function which calculates factorials.\n\n
  - https://4clojure.oxal.org/#/problem/42"
  [number]
  (reduce * (range 1 (+ number 1))))


(println (= (factorial-fun 1) 1))

(println (= (factorial-fun 3) 6))

(println (= (factorial-fun 5) 120))

(println (= (factorial-fun 8) 40320))