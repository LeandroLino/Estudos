(ns shopping-cart.core)


(defn compras []
  {:tomate {:quantidade 2 :preco 5}
   :arroz  {:quantidade 1 :preco 10}
   :feijao {:quantidade 2 :preco 7}})

(compras)

(get (compras) :tomate)
((compras) :tomate)
(:tomate (compras))

(:quantidade (:tomate (compras)))

(:batata (compras) {:quantidade 0 :preco 0})

