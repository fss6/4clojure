(ns for-clojure.49)

"The some function takes a predicate function and a collection.
It returns the first logical true value of (predicate x) where x is an item in the collection.\n\n
- https://4clojure.oxal.org/#/problem/49"

(defn split-a-sequence
  [n coll]
  (let [first (take n coll)
        last (drop n coll)]
    (into [] [(vec first) (vec last)])))

(println (= (split-a-sequence 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]]))
(println (= (split-a-sequence 1 [:a :b :c :d]) [[:a] [:b :c :d]]))
(println (= (split-a-sequence 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]]))


