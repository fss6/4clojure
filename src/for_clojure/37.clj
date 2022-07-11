(ns for-clojure.37)

;Regex patterns are supported with a special reader macro.
;https://4clojure.oxal.org/#/problem/37

;Write code which will fill in the above blanks:
(let [fill-str "ABC"]
  (println (= fill-str (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))))
