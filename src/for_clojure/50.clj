(ns for-clojure.50)

"Write a function which takes a sequence consisting of items with different types
and splits them up into a set of homogeneous sub-sequences. The internal order of
each sub-sequence should be maintained, but the sub-sequences themselves can be returned in
any order (this is why 'set' is used in the test cases).
- https://4clojure.oxal.org/#/problem/50"

(def C1 [1 :a 2 :b 3 :c])

(def C2 [:a "foo" "bar" :b])

(def C3 [[1 2] :a [3 4] 5 6 :b])

(defn new-seq
  ([coll]
   (new-seq coll []))
  ([coll new-coll]
   (let [current (first coll)
         pred #(= (type %) (type current))
         grouped-coll (->> (filterv pred coll)
                      (conj new-coll))
         current-coll (remove pred coll)]
     (if (empty? current-coll)
       grouped-coll
       (recur current-coll grouped-coll)))))

(println (set (new-seq C1)))
(println (set (new-seq C2)))
(println (set (new-seq C3)))