; A palindromic number reads the same both ways. The largest 
; palindrome made from the product of two 2-digit numbers
; is 9009 = 91 99.

; Find the largest palindrome made from the product of 
; two 3-digit numbers.

(defn palindrome? [palin]
  (= (str palin) (apply str (reverse (str palin)))))

(defn largest_palindrome [digits]
  (apply max (filter #(palindrome? %) (for [
    a (reverse (range (.pow (bigint 10) (dec digits))
      (.pow (bigint 10) digits))) 
    b (range a (.pow (bigint 10) digits))
  ] (* b a)))))

; (largest_palindrome 3) => 906609