(ns hospital.logic)

(defn cabe-na-fila?
  "Verifica se cabe mais mais alguem na fila"
  [hospital departamento]
  (-> hospital
      (get,,, departamento)
      count,,,
      (<,,, 5)))

(defn chega-em
  [hospital departamento pessoa]
  (if (cabe-na-fila? hospital departamento)
    (update hospital departamento conj pessoa)
    (throw (ex-info "Fila já está cheia" {:tentando-adicionar pessoa}))))


(defn chega-em-pausado
  [hospital departamento pessoa]
  (Thread/sleep (* (range) 1000))
  (if (cabe-na-fila? hospital departamento)
    (do
      ;(Thread/sleep (* (range) 1000))
      (update hospital departamento conj pessoa))
    (throw (ex-info "Fila já está cheia" {:tentando-adicionar pessoa}))))

(defn chega-em-pausado-logando
  [hospital departamento pessoa]
  (println "Tentando adicionar a pessoa" pessoa)
  (Thread/sleep (* (rand) 2000))
  (if (cabe-na-fila? hospital departamento)
    (do
      ;(Thread/sleep (* (rand) 2000))
      (println "dando o update" pessoa)
      (update hospital departamento conj pessoa))
    (throw (ex-info "Fila já está cheia" {:tentando-adicionar pessoa}))))

(defn atende
  [hospital departamento]
  (update hospital departamento pop))

(defn proxima-pessoa
  "Retorna o próximo paciente da fila"
  [hospital departamento]
  (-> hospital
      departamento
      peek))

(defn transfere
  "Transfere o proximo paciente da fila 'de' para a fila 'para'"
  [hospital de para]
  (let [pessoa (peek (get hospital de))]
    (-> hospital
        (atende de)
        (chega-em para pessoa))))

(defn atende-completo
  "Somente para demonstrar que é possivel retornar os dois ('quem' e a 'fila')"
  [hospital departamento]
  {:paciente (update hospital departamento peek)
   :hospital (update hospital departamento pop)})


;não ficou melhor
(defn atende-completo-que-chama-ambos
  "v2: Somente para demonstrar que é possivel retornar os dois ('quem' e a 'fila')"
  [hospital departamento]
  (let [fila (get hospital departamento)
        peek-pop (juxt peek pop)
        [pessoa fila-atualizada] (peek-pop fila)
        hospital-atualizado (hospital assoc departamento fila-atualizada)]
    {:paciente pessoa
     :hospital hospital-atualizado}))
