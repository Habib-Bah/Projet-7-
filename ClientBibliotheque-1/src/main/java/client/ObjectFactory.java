
package client;

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

    private final static QName _Utilisateur_QNAME = new QName("http://wsService.ws.oc.com/", "utilisateur");
    private final static QName _ReservationResponse_QNAME = new QName("http://wsService.ws.oc.com/", "reservationResponse");
    private final static QName _ProlongerpretResponse_QNAME = new QName("http://wsService.ws.oc.com/", "prolongerpretResponse");
    private final static QName _InscriptionResponse_QNAME = new QName("http://wsService.ws.oc.com/", "inscriptionResponse");
    private final static QName _Retour_QNAME = new QName("http://wsService.ws.oc.com/", "Retour");
    private final static QName _Inscription_QNAME = new QName("http://wsService.ws.oc.com/", "inscription");
    private final static QName _Reservation_QNAME = new QName("http://wsService.ws.oc.com/", "reservation");
    private final static QName _ListPretResponse_QNAME = new QName("http://wsService.ws.oc.com/", "ListPretResponse");
    private final static QName _Pret_QNAME = new QName("http://wsService.ws.oc.com/", "pret");
    private final static QName _ListPret_QNAME = new QName("http://wsService.ws.oc.com/", "ListPret");
    private final static QName _ConnexionEquipe_QNAME = new QName("http://wsService.ws.oc.com/", "connexionEquipe");
    private final static QName _RetourResponse_QNAME = new QName("http://wsService.ws.oc.com/", "RetourResponse");
    private final static QName _USerReservation_QNAME = new QName("http://wsService.ws.oc.com/", "USerReservation");
    private final static QName _USerReservationResponse_QNAME = new QName("http://wsService.ws.oc.com/", "USerReservationResponse");
    private final static QName _Connexion_QNAME = new QName("http://wsService.ws.oc.com/", "connexion");
    private final static QName _Listedeslivres_QNAME = new QName("http://wsService.ws.oc.com/", "Listedeslivres");
    private final static QName _ConnexionEquipeResponse_QNAME = new QName("http://wsService.ws.oc.com/", "connexionEquipeResponse");
    private final static QName _Prolongerpret_QNAME = new QName("http://wsService.ws.oc.com/", "prolongerpret");
    private final static QName _TrouverlivreResponse_QNAME = new QName("http://wsService.ws.oc.com/", "trouverlivreResponse");
    private final static QName _ConnexionResponse_QNAME = new QName("http://wsService.ws.oc.com/", "connexionResponse");
    private final static QName _ListedeslivresResponse_QNAME = new QName("http://wsService.ws.oc.com/", "ListedeslivresResponse");
    private final static QName _ListUser_QNAME = new QName("http://wsService.ws.oc.com/", "listUser");
    private final static QName _Trouverlivre_QNAME = new QName("http://wsService.ws.oc.com/", "trouverlivre");
    private final static QName _ListUserResponse_QNAME = new QName("http://wsService.ws.oc.com/", "listUserResponse");
    private final static QName _Livre_QNAME = new QName("http://wsService.ws.oc.com/", "livre");
    private final static QName _IOException_QNAME = new QName("http://wsService.ws.oc.com/", "IOException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListPret }
     * 
     */
    public ListPret createListPret() {
        return new ListPret();
    }

    /**
     * Create an instance of {@link ConnexionEquipe }
     * 
     */
    public ConnexionEquipe createConnexionEquipe() {
        return new ConnexionEquipe();
    }

    /**
     * Create an instance of {@link ListPretResponse }
     * 
     */
    public ListPretResponse createListPretResponse() {
        return new ListPretResponse();
    }

    /**
     * Create an instance of {@link Pret }
     * 
     */
    public Pret createPret() {
        return new Pret();
    }

    /**
     * Create an instance of {@link Connexion }
     * 
     */
    public Connexion createConnexion() {
        return new Connexion();
    }

    /**
     * Create an instance of {@link RetourResponse }
     * 
     */
    public RetourResponse createRetourResponse() {
        return new RetourResponse();
    }

    /**
     * Create an instance of {@link USerReservation }
     * 
     */
    public USerReservation createUSerReservation() {
        return new USerReservation();
    }

    /**
     * Create an instance of {@link USerReservationResponse }
     * 
     */
    public USerReservationResponse createUSerReservationResponse() {
        return new USerReservationResponse();
    }

    /**
     * Create an instance of {@link ReservationResponse }
     * 
     */
    public ReservationResponse createReservationResponse() {
        return new ReservationResponse();
    }

    /**
     * Create an instance of {@link ProlongerpretResponse }
     * 
     */
    public ProlongerpretResponse createProlongerpretResponse() {
        return new ProlongerpretResponse();
    }

    /**
     * Create an instance of {@link Utilisateur }
     * 
     */
    public Utilisateur createUtilisateur() {
        return new Utilisateur();
    }

    /**
     * Create an instance of {@link Retour }
     * 
     */
    public Retour createRetour() {
        return new Retour();
    }

    /**
     * Create an instance of {@link Inscription }
     * 
     */
    public Inscription createInscription() {
        return new Inscription();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link InscriptionResponse }
     * 
     */
    public InscriptionResponse createInscriptionResponse() {
        return new InscriptionResponse();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link Trouverlivre }
     * 
     */
    public Trouverlivre createTrouverlivre() {
        return new Trouverlivre();
    }

    /**
     * Create an instance of {@link ListUserResponse }
     * 
     */
    public ListUserResponse createListUserResponse() {
        return new ListUserResponse();
    }

    /**
     * Create an instance of {@link Livre }
     * 
     */
    public Livre createLivre() {
        return new Livre();
    }

    /**
     * Create an instance of {@link Prolongerpret }
     * 
     */
    public Prolongerpret createProlongerpret() {
        return new Prolongerpret();
    }

    /**
     * Create an instance of {@link TrouverlivreResponse }
     * 
     */
    public TrouverlivreResponse createTrouverlivreResponse() {
        return new TrouverlivreResponse();
    }

    /**
     * Create an instance of {@link ConnexionResponse }
     * 
     */
    public ConnexionResponse createConnexionResponse() {
        return new ConnexionResponse();
    }

    /**
     * Create an instance of {@link Listedeslivres }
     * 
     */
    public Listedeslivres createListedeslivres() {
        return new Listedeslivres();
    }

    /**
     * Create an instance of {@link ConnexionEquipeResponse }
     * 
     */
    public ConnexionEquipeResponse createConnexionEquipeResponse() {
        return new ConnexionEquipeResponse();
    }

    /**
     * Create an instance of {@link ListedeslivresResponse }
     * 
     */
    public ListedeslivresResponse createListedeslivresResponse() {
        return new ListedeslivresResponse();
    }

    /**
     * Create an instance of {@link ListUser }
     * 
     */
    public ListUser createListUser() {
        return new ListUser();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Utilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "utilisateur")
    public JAXBElement<Utilisateur> createUtilisateur(Utilisateur value) {
        return new JAXBElement<Utilisateur>(_Utilisateur_QNAME, Utilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "reservationResponse")
    public JAXBElement<ReservationResponse> createReservationResponse(ReservationResponse value) {
        return new JAXBElement<ReservationResponse>(_ReservationResponse_QNAME, ReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProlongerpretResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "prolongerpretResponse")
    public JAXBElement<ProlongerpretResponse> createProlongerpretResponse(ProlongerpretResponse value) {
        return new JAXBElement<ProlongerpretResponse>(_ProlongerpretResponse_QNAME, ProlongerpretResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InscriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "inscriptionResponse")
    public JAXBElement<InscriptionResponse> createInscriptionResponse(InscriptionResponse value) {
        return new JAXBElement<InscriptionResponse>(_InscriptionResponse_QNAME, InscriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retour }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "Retour")
    public JAXBElement<Retour> createRetour(Retour value) {
        return new JAXBElement<Retour>(_Retour_QNAME, Retour.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "inscription")
    public JAXBElement<Inscription> createInscription(Inscription value) {
        return new JAXBElement<Inscription>(_Inscription_QNAME, Inscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "reservation")
    public JAXBElement<Reservation> createReservation(Reservation value) {
        return new JAXBElement<Reservation>(_Reservation_QNAME, Reservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPretResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "ListPretResponse")
    public JAXBElement<ListPretResponse> createListPretResponse(ListPretResponse value) {
        return new JAXBElement<ListPretResponse>(_ListPretResponse_QNAME, ListPretResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pret }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "pret")
    public JAXBElement<Pret> createPret(Pret value) {
        return new JAXBElement<Pret>(_Pret_QNAME, Pret.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPret }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "ListPret")
    public JAXBElement<ListPret> createListPret(ListPret value) {
        return new JAXBElement<ListPret>(_ListPret_QNAME, ListPret.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnexionEquipe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "connexionEquipe")
    public JAXBElement<ConnexionEquipe> createConnexionEquipe(ConnexionEquipe value) {
        return new JAXBElement<ConnexionEquipe>(_ConnexionEquipe_QNAME, ConnexionEquipe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetourResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "RetourResponse")
    public JAXBElement<RetourResponse> createRetourResponse(RetourResponse value) {
        return new JAXBElement<RetourResponse>(_RetourResponse_QNAME, RetourResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USerReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "USerReservation")
    public JAXBElement<USerReservation> createUSerReservation(USerReservation value) {
        return new JAXBElement<USerReservation>(_USerReservation_QNAME, USerReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USerReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "USerReservationResponse")
    public JAXBElement<USerReservationResponse> createUSerReservationResponse(USerReservationResponse value) {
        return new JAXBElement<USerReservationResponse>(_USerReservationResponse_QNAME, USerReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Connexion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "connexion")
    public JAXBElement<Connexion> createConnexion(Connexion value) {
        return new JAXBElement<Connexion>(_Connexion_QNAME, Connexion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listedeslivres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "Listedeslivres")
    public JAXBElement<Listedeslivres> createListedeslivres(Listedeslivres value) {
        return new JAXBElement<Listedeslivres>(_Listedeslivres_QNAME, Listedeslivres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnexionEquipeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "connexionEquipeResponse")
    public JAXBElement<ConnexionEquipeResponse> createConnexionEquipeResponse(ConnexionEquipeResponse value) {
        return new JAXBElement<ConnexionEquipeResponse>(_ConnexionEquipeResponse_QNAME, ConnexionEquipeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prolongerpret }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "prolongerpret")
    public JAXBElement<Prolongerpret> createProlongerpret(Prolongerpret value) {
        return new JAXBElement<Prolongerpret>(_Prolongerpret_QNAME, Prolongerpret.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverlivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "trouverlivreResponse")
    public JAXBElement<TrouverlivreResponse> createTrouverlivreResponse(TrouverlivreResponse value) {
        return new JAXBElement<TrouverlivreResponse>(_TrouverlivreResponse_QNAME, TrouverlivreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnexionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "connexionResponse")
    public JAXBElement<ConnexionResponse> createConnexionResponse(ConnexionResponse value) {
        return new JAXBElement<ConnexionResponse>(_ConnexionResponse_QNAME, ConnexionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListedeslivresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "ListedeslivresResponse")
    public JAXBElement<ListedeslivresResponse> createListedeslivresResponse(ListedeslivresResponse value) {
        return new JAXBElement<ListedeslivresResponse>(_ListedeslivresResponse_QNAME, ListedeslivresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "listUser")
    public JAXBElement<ListUser> createListUser(ListUser value) {
        return new JAXBElement<ListUser>(_ListUser_QNAME, ListUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Trouverlivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "trouverlivre")
    public JAXBElement<Trouverlivre> createTrouverlivre(Trouverlivre value) {
        return new JAXBElement<Trouverlivre>(_Trouverlivre_QNAME, Trouverlivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "listUserResponse")
    public JAXBElement<ListUserResponse> createListUserResponse(ListUserResponse value) {
        return new JAXBElement<ListUserResponse>(_ListUserResponse_QNAME, ListUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Livre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "livre")
    public JAXBElement<Livre> createLivre(Livre value) {
        return new JAXBElement<Livre>(_Livre_QNAME, Livre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.ws.oc.com/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

}
