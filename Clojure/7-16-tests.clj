;Testes em clojure

;Vantagens do codigo auto-testavel (self-testing code)

;Funcionam também como testes de regressdo
;Funcionam como documentagao executavel
;Auxiliam na identificagao de interfaces ruins

;Exemplos de testes TDD
;Regra de negocio:

"Se valor da compra for até 100, deve-se cobrar 15 reais de taxa de entrega.
Se for maior que 100 e menor que 200, 5 reais.
Se for acima de 200, a taxa é gratuita."

;deftest define um conjuto de testes
(deftest compras-test
  (testing "Dado um valor abaixo de 100 reais, então a taxa de entrega deve ser 15 reais"
    (is (= 15 (delivery-taxes 1)))
    (is (= 15 (delivery-taxes 100))))
  (testing "Dado um valor entre 100 e 200 reais, então a taxa de entrega deve ser 5 reais"
    (is (= 5 (delivery-taxes 100.01)))
    (is (= 5 (delivery-taxes 200))))
  (testing "Dado um valor acima de 200 reais, então a taxa de entrega deve ser 0 reais"
    (is (= 0 (delivery-taxes 200.01)))
    (is (= 5 (delivery-taxes 200)))))

;Declarar função de taxas:
(defn delivery-taxes [cart-value]
  (if (<= cart-value 100)
    15
    (if (<= cart-value 200)
      5
      0)))
