(ns hangman.core
  (:gen-class))

(defn loose-msg [] (print "you loose"))
(defn win-msg [] (print "you win"))
(def total-lifes 5)


(defn read-letter! [] (read-line))

(defn analyse-guess [guess lifes word right-letters]
  (if (contains? word guess)
    (game lifes word (conj right-letters guess)
    (game (dec lifes) word right-letters) )))


(defn print-game [word right-letters] 
  (doseq [l (seq word)]
    (if  (contains? right-letters (str l) 
      (print l " ") 
      (print "_" " ")))))
   
(defn missing-letters [word right-letters]
  (remove (fn [letter] (contains? right-letters (str letter)) word)))

(defn completed-word? [word right-letters]
  (empty? (missing-letters word right-letters)))

(defn game [lifes word right-letters]
  (print-game word right-letters)
	(cond 
    (= lifes 0) (loose-msg)
    (if (completed-word? word right-letters) (win-msg)
    :else
    (let [guess (read-letter!)]
       (if (contains? word guess)
         (do
          (println "Good guess! you found a word.")
          (recur lifes word (conj right-letters guess))
         (do
          (println "bad guess! you wrong.")
          (recur (dec lifes) word right-letters) ))))
    
(defn -main
  "hangman game."
  [& args]
  (println "Hello, World!"))
