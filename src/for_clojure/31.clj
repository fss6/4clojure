(ns for_clojure.30)

(defn compress-a-sequence
  "Write a function which removes consecutive duplicates from a sequence.
  https://4clojure.oxal.org/#/problem/30"
  ([entry] (compress-a-sequence entry []))
  ([entry, result]
   (if (empty? entry)
     (apply list result)
     (let [first-item   (first entry)
           last-item    (last result)
           item-equals? (= first-item last-item)
           new-result   (conj result first-item)]
       (recur (rest entry) (if item-equals? result new-result))))))


(println (= (apply str (compress-a-sequence "Leeeeeerrroyyy")) "Leroy"))

(println (= (compress-a-sequence [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))

(println (= (compress-a-sequence [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2])))
