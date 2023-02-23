(ns for-clojure.53)

"Given a vector of integers, find the longest consecutive sub-sequence of increasing\n
numbers. If two sub-sequences have the same length, use the one that occurs first.\n
An increasing sub-sequence must have a length of 2 or greater to qualify.\n\n
- https://4clojure.oxal.org/#/problem/53"

(defn longest-increasing
  ([coll]
   (longest-increasing coll (vector [])))
  ([[x & xs] increasing-coll]
   (let [last-increasing-coll (last increasing-coll)
         increasing? (= (- x 1) (last last-increasing-coll))
         new-increasing-coll (if increasing?
                              (conj increasing-coll (conj last-increasing-coll x))
                              (conj increasing-coll [x]))]
     (if (empty? xs)
       (let [max-func #(if (> (count %1) (count %2)) %1 %2)
             max-coll (reduce max-func new-increasing-coll)]
         (if (> (count max-coll) 1) max-coll []))
       (recur xs new-increasing-coll)))))


(println (= (longest-increasing [1 0 1 2 3 0 4 5]) [0 1 2 3]))

(println (= (longest-increasing [5 6 1 3 2 7]) [5 6]))

(println (= (longest-increasing [2 3 3 4 5]) [3 4 5]))

(println (= (longest-increasing [7 6 5 4]) []))