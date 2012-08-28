; Find the sum of the digits in the number 100!

(defn fac [number]
  (reduce *' (range 1 (inc number))))

(defn fac-sum [number]
  (reduce + (map #(Character/getNumericValue %) (str (fac number)))))

; (fac-sum 100) => 648