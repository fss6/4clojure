(ns for-clojure.36)

;Can you bind x, y, and z so that these are all true?
;https://4clojure.oxal.org/#/problem/36

(let [z   1
      y   (- 4 z)
      x   (- 10 y)]
  (println (= 10 (+ x y)))
  (println (= 4 (+ y z)))
  (println (= 1 z)))


