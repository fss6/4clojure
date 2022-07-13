(ns for-clojure.40)

(defn interpose-a-sequence
  "Write a function which separates the items of a sequence by an arbitrary value.
  - Special Restrictions : interpose\n\n
  - https://4clojure.oxal.org/#/problem/40"
  [separator seq]
  (reduce into
          (let [new-seq   (mapv (fn [v] [v separator]) seq)
                last-item [(first (last new-seq))]]
            (conj (pop new-seq) last-item))))



(println (= (interpose-a-sequence 0 [1 2 3]) [1 0 2 0 3]))

(println (= (apply str (interpose-a-sequence ", " ["one" "two" "three"])) "one, two, three"))

(println (= (interpose-a-sequence :z [:a :b :c :d]) [:a :z :b :z :c :z :d]))