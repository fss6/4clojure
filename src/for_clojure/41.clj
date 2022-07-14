(ns for-clojure.41)


(def seq41a [1 2 3 4 5 6 7 8])
(def seq41b [:a :b :c :d :e :f])
(def seq41c [1 2 3 4 5 6])

(defn drop-every-nth
  "Write a function which drops every Nth item from a sequence.\n\n
  - https://4clojure.oxal.org/#/problem/41"
  [coll nth-value]
  (->> coll
       (partition-all nth-value)
       (mapv #(if (= (count %1) nth-value) (drop-last %1) %1))
       (mapv #(into [] %1))
       (reduce into)))

(println (drop-every-nth seq41a 3))
(println (= (drop-every-nth [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8]))

(println (drop-every-nth seq41b 2))
(println (= (drop-every-nth [:a :b :c :d :e :f] 2) [:a :c :e]))

(println (drop-every-nth seq41c 4))
(println (= (drop-every-nth [1 2 3 4 5 6] 4) [1 2 3 5 6]))
