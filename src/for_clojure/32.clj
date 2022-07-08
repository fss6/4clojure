(ns for_clojure.32)

(defn duplicate-a-sequence
  "Write a function which duplicates each element of a sequence.\n\n
  https://4clojure.oxal.org/#/problem/32"
  ([coll] (duplicate-a-sequence coll []))
  ([coll, new-coll]
   (if (empty? coll)
     new-coll
     (let [current [(first coll)]]
       (recur
         (rest coll)
         (into new-coll (concat current current)))))))


(println (= (duplicate-a-sequence [1 2 3]) '(1 1 2 2 3 3)))

(println (= (duplicate-a-sequence [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)))

(println (= (duplicate-a-sequence [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))

(println (= (duplicate-a-sequence [44 33]) [44 44 33 33]))
