(ns for-clojure.39)

(defn interleave-two-sequences
  [seq1 seq2]
  "Write a function which takes two sequences and returns the first item from \n\n
   each, then the second item from each, then the third, etc.
   - Special Restrictions : interleave
   - https://4clojure.oxal.org/#/problem/39"
  (apply list
         (reduce into
                 (mapv
                   #(if-not (or (nil? %1) (nil? %2))
                       [%1 %2]) seq1 seq2))))


(println (= (interleave-two-sequences [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c)))
(println (= (interleave-two-sequences [1 2] [3 4 5 6]) '(1 3 2 4)) )
(println (= (interleave-two-sequences [1 2 3 4] [5]) [1 5]))
(println (= (interleave-two-sequences [30 20] [25 15]) [30 25 20 15]))