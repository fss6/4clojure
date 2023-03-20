(ns for-clojure.55)

"Write a function which returns a map containing the number of occurences of each distinct item in a sequence.\n\n
- https://4clojure.oxal.org/#/problem/55"

(defn custom-frequencies
  ([coll] (custom-frequencies coll {}))               ;(custom-frequencies coll {})
  ([coll map-items]
   (let [item (first coll)]
     (if-not (boolean item)
       map-items
       (recur (drop 1 coll)
              (if (contains? map-items item)
                (update map-items item inc)
                (assoc map-items item 1)))))))


(println (= (custom-frequencies [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1}))

(println (= (custom-frequencies [:b :a :b :a :b]) {:a 2, :b 3}))

(println (= (custom-frequencies '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2}))
