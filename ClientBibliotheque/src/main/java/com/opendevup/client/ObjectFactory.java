
package com.opendevup.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Pret_QNAME = new QName("http://service/", "pret");
    private final static QName _Liste_0020Des_0020LivresResponse_QNAME = new QName("http://service/", "Liste des livresResponse");
    private final static QName _ConnexionResponse_QNAME = new QName("http://service/", "connexionResponse");
    private final static QName _InscriptionResponse_QNAME = new QName("http://service/", "inscriptionResponse");
    private final static QName _Livre_QNAME = new QName("http://service/", "livre");
    private final static QName _PretResponse_QNAME = new QName("http://service/", "pretResponse");
    private final static QName _Liste_0020Des_0020Livres_QNAME = new QName("http://service/", "Liste des livres");
    private final static QName _Connexion_QNAME = new QName("http://service/", "connexion");
    private final static QName _Inscription_QNAME = new QName("http://service/", "inscription");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Liste_0020Des_0020LivresResponse }
     * 
     */
    public Liste_0020Des_0020LivresResponse createListe_0020Des_0020LivresResponse() {
        return new Liste_0020Des_0020LivresResponse();
    }

    /**
     * Create an instance of {@link ConnexionResponse }
     * 
     */
    public ConnexionResponse createConnexionResponse() {
        return new ConnexionResponse();
    }

    /**
     * Create an instance of {@link Pret }
     * 
     */
    public Pret createPret() {
        return new Pret();
    }

    /**
     * Create an instance of {@link Inscription }
     * 
     */
    public Inscription createInscription() {
        return new Inscription();
    }

    /**
     * Create an instance of {@link Connexion }
     * 
     */
    public Connexion createConnexion() {
        return new Connexion();
    }

    /**
     * Create an instance of {@link Liste_0020Des_0020Livres }
     * 
     */
    public Liste_0020Des_0020Livres createListe_0020Des_0020Livres() {
        return new Liste_0020Des_0020Livres();
    }

    /**
     * Create an instance of {@link InscriptionResponse }
     * 
     */
    public InscriptionResponse createInscriptionResponse() {
        return new InscriptionResponse();
    }

    /**
     * Create an instance of {@link Livre }
     * 
     */
    public Livre createLivre() {
        return new Livre();
    }

    /**
     * Create an instance of {@link PretResponse }
     * 
     */
    public PretResponse createPretResponse() {
        return new PretResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pret }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "pret")
    public JAXBElement<Pret> createPret(Pret value) {
        return new JAXBElement<Pret>(_Pret_QNAME, Pret.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Liste_0020Des_0020LivresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "Liste des livresResponse")
    public JAXBElement<Liste_0020Des_0020LivresResponse> createListe_0020Des_0020LivresResponse(Liste_0020Des_0020LivresResponse value) {
        return new JAXBElement<Liste_0020Des_0020LivresResponse>(_Liste_0020Des_0020LivresResponse_QNAME, Liste_0020Des_0020LivresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnexionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "connexionResponse")
    public JAXBElement<ConnexionResponse> createConnexionResponse(ConnexionResponse value) {
        return new JAXBElement<ConnexionResponse>(_ConnexionResponse_QNAME, ConnexionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InscriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "inscriptionResponse")
    public JAXBElement<InscriptionResponse> createInscriptionResponse(InscriptionResponse value) {
        return new JAXBElement<InscriptionResponse>(_InscriptionResponse_QNAME, InscriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Livre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "livre")
    public JAXBElement<Livre> createLivre(Livre value) {
        return new JAXBElement<Livre>(_Livre_QNAME, Livre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PretResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "pretResponse")
    public JAXBElement<PretResponse> createPretResponse(PretResponse value) {
        return new JAXBElement<PretResponse>(_PretResponse_QNAME, PretResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Liste_0020Des_0020Livres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "Liste des livres")
    public JAXBElement<Liste_0020Des_0020Livres> createListe_0020Des_0020Livres(Liste_0020Des_0020Livres value) {
        return new JAXBElement<Liste_0020Des_0020Livres>(_Liste_0020Des_0020Livres_QNAME, Liste_0020Des_0020Livres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Connexion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "connexion")
    public JAXBElement<Connexion> createConnexion(Connexion value) {
        return new JAXBElement<Connexion>(_Connexion_QNAME, Connexion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "inscription")
    public JAXBElement<Inscription> createInscription(Inscription value) {
        return new JAXBElement<Inscription>(_Inscription_QNAME, Inscription.class, null, value);
    }

}
