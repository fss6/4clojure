(ns for_clojure.31)

(defn packs-consecutive-duplicates
  "Write a function which packs consecutive duplicates into sub-lists.
  https://4clojure.oxal.org/#/problem/31"
  [coll]
  (partition-by identity coll))

(println (= (packs-consecutive-duplicates [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3))))

(println (= (packs-consecutive-duplicates [:a :a :b :b :c]) '((:a :a) (:b :b) (:c))))

(println (= (packs-consecutive-duplicates [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4]))))
