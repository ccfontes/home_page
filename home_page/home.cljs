(ns home-page.home)

(defn handler [input]
  (-> {:body (pr-str {:hello "Clojurescriiiiipt!"
                      :input input})
       :statusCode 200
       :headers {"Content-Type" "application/edn"}}
      clj->js))
 
