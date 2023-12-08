;Mapas

(conj [1 2 3] 4)
(conj [1 2 3] 4 5)
(conj [1 2 3] "Marcio")
(conj [1 2 3] [4 5])
(pop [1 2 3])
(peek [1 2 3])

(defn compras []
  {:tomate {:quantidade 2 :preco 5}
   :arroz  {:quantidade 1 :preco 10}
   :feijao {:quantidade 2 :preco 7}})

(conj (compras) {:alface {:quantidade 2 :preco 1}})
(assoc (compras) :alface {:quantidade 2 :preco 1})

(dissoc (compras) :tomate :arroz)

(assoc (compras) :feijao {:quantidade 2 :preco 1})

(update {:name "Lino" :idade 21} :idade inc)

(update-in (compras) [:tomate :preco] inc)

