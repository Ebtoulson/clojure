(def input-str [" _     _  _     _  _  _  _  _ "
                "| |  | _| _||_||_ |_   ||_||_|"
                "|_|  ||_  _|  | _||_|  ||_| _|"])


(def dictionary {" _ | ||_|" 0,
                 "     |  |" 1,
                 " _  _||_ " 2,
                 " _  _| _|" 3,
                 "   |_|  |" 4,
                 " _ |_  _|" 5,
                 " _ |_ |_|" 6,
                 " _   |  |" 7,
                 " _ |_||_|" 8,
                 " _ |_| _|" 9})

(defn decode [input]
  (let [[top mid bottom] (map #(partition 3 %) input) ;each letter is a 3x3
         char-list (map concat top mid bottom) ;concat the 3 3x1
         letters   (map #(apply str %) char-list) ;convert to string
         numbers   (map #(get dictionary %) letters)] ;lookup
    numbers))

(decode input-str)