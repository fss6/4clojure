(ns for-clojure.38)

(defn maximum-value
  "Write a function which takes a variable number of parameters and returns the maximum value.\n\n
  - Special Restrictions : max,max-key;
  https://4clojure.oxal.org/#/problem/38"
  [& args]
  (->> args
       (reduce #(if (>= %1 %2) %1 %2))))

(println (= (maximum-value 1 8 3 4) 8))

(println (= (maximum-value 30 20) 30))

(println (= (maximum-value 45 67 11) 67))