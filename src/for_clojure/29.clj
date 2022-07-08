(ns for_clojure.29)

(defn capital-letters
  "https://4clojure.oxal.org/#/problem/29"
  [entry]
  (->> entry
       (map #(str %1))
       (reduce
         (fn [s1 s2]
           (let [is-upper?  #(= %1 (clojure.string/upper-case %1))
                 is-letter? #(re-seq #"[A-Z]" %1)
                 is-valid?  #(and (is-upper? %1) (is-letter? %1))]
             (str (if (is-valid? s1) s1) (if (is-valid? s2) s2)))))))


(println (= (capital-letters "HeLlO, WoRlD!") "HLOWRD"))

(println (empty? (capital-letters "nothing")))

(println (= (capital-letters "$#A(*&987Zf") "AZ"))