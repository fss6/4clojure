(ns for-clojure.35)

(defn special-let
  "Clojure lets you give local names to values using the special let-form.\n\n
  https://4clojure.oxal.org/#/problem/35"
  []
  (let [x 7] x))

(println (= (special-let) (let [x 5] (+ 2 x))))

(println (= (special-let) (let [x 3, y 10] (- y x))))

(println (= (special-let) (let [x 21] (let [y 3] (/ x y)))))

(println (= (special-let) (let [x 7] x )))