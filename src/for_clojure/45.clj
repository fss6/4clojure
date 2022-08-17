(ns for-clojure.45)

;; The iterate function can be used to produce an infinite lazy sequence.

(def seq-iterate '(1 4 7 10 13))

(println (= seq-iterate (take 5 (iterate #(+ 3 %) 1))))

