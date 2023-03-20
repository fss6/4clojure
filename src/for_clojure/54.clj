(ns for-clojure.54)

"Given a vector of integers, find the longest consecutive sub-sequence of increasing\n
numbers. If two sub-sequences have the same length, use the one that occurs first.\n
An increasing sub-sequence must have a length of 2 or greater to qualify.\n\n
- https://4clojure.oxal.org/#/problem/54"

(defn custom-partition
  ([n coll]
   (custom-partition n coll []))
  ([n coll partitions]
   (let [partition (take n coll)
         tail (drop n coll)]
     (if (> n (count partition))
       (seq partitions)
       (recur n tail (conj partitions partition))))))


(println (= (custom-partition 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8))))

(println (= (custom-partition 2 (range 8)) '((0 1) (2 3) (4 5) (6 7))))

(println (= (custom-partition 3 (range 8)) '((0 1 2) (3 4 5))))