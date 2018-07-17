//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.17 at 08:51:18 AM BRT 
//


package org.jabref.logic.importer.fileformat.endnote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "database",
    "sourceApp",
    "recNumber",
    "refType",
    "contributors",
    "authAddress",
    "authAffiliaton",
    "titles",
    "periodical",
    "pages",
    "volume",
    "number",
    "issue",
    "secondaryVolume",
    "secondaryIssue",
    "numVols",
    "edition",
    "section",
    "reprintEdition",
    "reprintStatus",
    "keywords",
    "dates",
    "pubLocation",
    "publisher",
    "origPub",
    "isbn",
    "accessionNum",
    "callNum",
    "reportId",
    "coden",
    "electronicResourceNum",
    "_abstract",
    "label",
    "image",
    "caption",
    "notes",
    "researchNotes",
    "workType",
    "reviewedItem",
    "availability",
    "remoteSource",
    "meetingPlace",
    "workLocation",
    "workExtent",
    "packMethod",
    "size",
    "reproRatio",
    "remoteDatabaseName",
    "remoteDatabaseProvider",
    "language",
    "urls",
    "accessDate",
    "modifiedDate",
    "custom1",
    "custom2",
    "custom3",
    "custom4",
    "custom5",
    "custom6",
    "custom7",
    "misc1",
    "misc2",
    "misc3"
})
@XmlRootElement(name = "record")
public class Record {

    protected Database database;
    @XmlElement(name = "source-app")
    protected SourceApp sourceApp;
    @XmlElement(name = "rec-number")
    protected String recNumber;
    @XmlElement(name = "ref-type")
    protected RefType refType;
    protected Contributors contributors;
    @XmlElement(name = "auth-address")
    protected AuthAddress authAddress;
    @XmlElement(name = "auth-affiliaton")
    protected AuthAffiliaton authAffiliaton;
    protected Titles titles;
    protected Periodical periodical;
    protected Pages pages;
    protected Volume volume;
    protected Number number;
    protected Issue issue;
    @XmlElement(name = "secondary-volume")
    protected SecondaryVolume secondaryVolume;
    @XmlElement(name = "secondary-issue")
    protected SecondaryIssue secondaryIssue;
    @XmlElement(name = "num-vols")
    protected NumVols numVols;
    protected Edition edition;
    protected Section section;
    @XmlElement(name = "reprint-edition")
    protected ReprintEdition reprintEdition;
    @XmlElement(name = "reprint-status")
    protected ReprintStatus reprintStatus;
    protected Keywords keywords;
    protected Dates dates;
    @XmlElement(name = "pub-location")
    protected PubLocation pubLocation;
    protected Publisher publisher;
    @XmlElement(name = "orig-pub")
    protected OrigPub origPub;
    protected Isbn isbn;
    @XmlElement(name = "accession-num")
    protected AccessionNum accessionNum;
    @XmlElement(name = "call-num")
    protected CallNum callNum;
    @XmlElement(name = "report-id")
    protected ReportId reportId;
    protected Coden coden;
    @XmlElement(name = "electronic-resource-num")
    protected ElectronicResourceNum electronicResourceNum;
    @XmlElement(name = "abstract")
    protected Abstract _abstract;
    protected Label label;
    protected Image image;
    protected Caption caption;
    protected Notes notes;
    @XmlElement(name = "research-notes")
    protected ResearchNotes researchNotes;
    @XmlElement(name = "work-type")
    protected WorkType workType;
    @XmlElement(name = "reviewed-item")
    protected ReviewedItem reviewedItem;
    protected Availability availability;
    @XmlElement(name = "remote-source")
    protected RemoteSource remoteSource;
    @XmlElement(name = "meeting-place")
    protected MeetingPlace meetingPlace;
    @XmlElement(name = "work-location")
    protected WorkLocation workLocation;
    @XmlElement(name = "work-extent")
    protected WorkExtent workExtent;
    @XmlElement(name = "pack-method")
    protected PackMethod packMethod;
    protected Size size;
    @XmlElement(name = "repro-ratio")
    protected ReproRatio reproRatio;
    @XmlElement(name = "remote-database-name")
    protected RemoteDatabaseName remoteDatabaseName;
    @XmlElement(name = "remote-database-provider")
    protected RemoteDatabaseProvider remoteDatabaseProvider;
    protected Language language;
    protected Urls urls;
    @XmlElement(name = "access-date")
    protected AccessDate accessDate;
    @XmlElement(name = "modified-date")
    protected ModifiedDate modifiedDate;
    protected Custom1 custom1;
    protected Custom2 custom2;
    protected Custom3 custom3;
    protected Custom4 custom4;
    protected Custom5 custom5;
    protected Custom6 custom6;
    protected Custom7 custom7;
    protected Misc1 misc1;
    protected Misc2 misc2;
    protected Misc3 misc3;

    /**
     * Gets the value of the database property.
     * 
     * @return
     *     possible object is
     *     {@link Database }
     *     
     */
    public Database getDatabase() {
        return database;
    }

    /**
     * Sets the value of the database property.
     * 
     * @param value
     *     allowed object is
     *     {@link Database }
     *     
     */
    public void setDatabase(Database value) {
        this.database = value;
    }

    /**
     * Gets the value of the sourceApp property.
     * 
     * @return
     *     possible object is
     *     {@link SourceApp }
     *     
     */
    public SourceApp getSourceApp() {
        return sourceApp;
    }

    /**
     * Sets the value of the sourceApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceApp }
     *     
     */
    public void setSourceApp(SourceApp value) {
        this.sourceApp = value;
    }

    /**
     * Gets the value of the recNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecNumber() {
        return recNumber;
    }

    /**
     * Sets the value of the recNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecNumber(String value) {
        this.recNumber = value;
    }

    /**
     * Gets the value of the refType property.
     * 
     * @return
     *     possible object is
     *     {@link RefType }
     *     
     */
    public RefType getRefType() {
        return refType;
    }

    /**
     * Sets the value of the refType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefType }
     *     
     */
    public void setRefType(RefType value) {
        this.refType = value;
    }

    /**
     * Gets the value of the contributors property.
     * 
     * @return
     *     possible object is
     *     {@link Contributors }
     *     
     */
    public Contributors getContributors() {
        return contributors;
    }

    /**
     * Sets the value of the contributors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contributors }
     *     
     */
    public void setContributors(Contributors value) {
        this.contributors = value;
    }

    /**
     * Gets the value of the authAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AuthAddress }
     *     
     */
    public AuthAddress getAuthAddress() {
        return authAddress;
    }

    /**
     * Sets the value of the authAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthAddress }
     *     
     */
    public void setAuthAddress(AuthAddress value) {
        this.authAddress = value;
    }

    /**
     * Gets the value of the authAffiliaton property.
     * 
     * @return
     *     possible object is
     *     {@link AuthAffiliaton }
     *     
     */
    public AuthAffiliaton getAuthAffiliaton() {
        return authAffiliaton;
    }

    /**
     * Sets the value of the authAffiliaton property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthAffiliaton }
     *     
     */
    public void setAuthAffiliaton(AuthAffiliaton value) {
        this.authAffiliaton = value;
    }

    /**
     * Gets the value of the titles property.
     * 
     * @return
     *     possible object is
     *     {@link Titles }
     *     
     */
    public Titles getTitles() {
        return titles;
    }

    /**
     * Sets the value of the titles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Titles }
     *     
     */
    public void setTitles(Titles value) {
        this.titles = value;
    }

    /**
     * Gets the value of the periodical property.
     * 
     * @return
     *     possible object is
     *     {@link Periodical }
     *     
     */
    public Periodical getPeriodical() {
        return periodical;
    }

    /**
     * Sets the value of the periodical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Periodical }
     *     
     */
    public void setPeriodical(Periodical value) {
        this.periodical = value;
    }

    /**
     * Gets the value of the pages property.
     * 
     * @return
     *     possible object is
     *     {@link Pages }
     *     
     */
    public Pages getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pages }
     *     
     */
    public void setPages(Pages value) {
        this.pages = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link Volume }
     *     
     */
    public Volume getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Volume }
     *     
     */
    public void setVolume(Volume value) {
        this.volume = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Number }
     *     
     */
    public Number getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Number }
     *     
     */
    public void setNumber(Number value) {
        this.number = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link Issue }
     *     
     */
    public Issue getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Issue }
     *     
     */
    public void setIssue(Issue value) {
        this.issue = value;
    }

    /**
     * Gets the value of the secondaryVolume property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryVolume }
     *     
     */
    public SecondaryVolume getSecondaryVolume() {
        return secondaryVolume;
    }

    /**
     * Sets the value of the secondaryVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryVolume }
     *     
     */
    public void setSecondaryVolume(SecondaryVolume value) {
        this.secondaryVolume = value;
    }

    /**
     * Gets the value of the secondaryIssue property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryIssue }
     *     
     */
    public SecondaryIssue getSecondaryIssue() {
        return secondaryIssue;
    }

    /**
     * Sets the value of the secondaryIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryIssue }
     *     
     */
    public void setSecondaryIssue(SecondaryIssue value) {
        this.secondaryIssue = value;
    }

    /**
     * Gets the value of the numVols property.
     * 
     * @return
     *     possible object is
     *     {@link NumVols }
     *     
     */
    public NumVols getNumVols() {
        return numVols;
    }

    /**
     * Sets the value of the numVols property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumVols }
     *     
     */
    public void setNumVols(NumVols value) {
        this.numVols = value;
    }

    /**
     * Gets the value of the edition property.
     * 
     * @return
     *     possible object is
     *     {@link Edition }
     *     
     */
    public Edition getEdition() {
        return edition;
    }

    /**
     * Sets the value of the edition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Edition }
     *     
     */
    public void setEdition(Edition value) {
        this.edition = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link Section }
     *     
     */
    public Section getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link Section }
     *     
     */
    public void setSection(Section value) {
        this.section = value;
    }

    /**
     * Gets the value of the reprintEdition property.
     * 
     * @return
     *     possible object is
     *     {@link ReprintEdition }
     *     
     */
    public ReprintEdition getReprintEdition() {
        return reprintEdition;
    }

    /**
     * Sets the value of the reprintEdition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReprintEdition }
     *     
     */
    public void setReprintEdition(ReprintEdition value) {
        this.reprintEdition = value;
    }

    /**
     * Gets the value of the reprintStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ReprintStatus }
     *     
     */
    public ReprintStatus getReprintStatus() {
        return reprintStatus;
    }

    /**
     * Sets the value of the reprintStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReprintStatus }
     *     
     */
    public void setReprintStatus(ReprintStatus value) {
        this.reprintStatus = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link Keywords }
     *     
     */
    public Keywords getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Keywords }
     *     
     */
    public void setKeywords(Keywords value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the dates property.
     * 
     * @return
     *     possible object is
     *     {@link Dates }
     *     
     */
    public Dates getDates() {
        return dates;
    }

    /**
     * Sets the value of the dates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dates }
     *     
     */
    public void setDates(Dates value) {
        this.dates = value;
    }

    /**
     * Gets the value of the pubLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PubLocation }
     *     
     */
    public PubLocation getPubLocation() {
        return pubLocation;
    }

    /**
     * Sets the value of the pubLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PubLocation }
     *     
     */
    public void setPubLocation(PubLocation value) {
        this.pubLocation = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link Publisher }
     *     
     */
    public Publisher getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Publisher }
     *     
     */
    public void setPublisher(Publisher value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the origPub property.
     * 
     * @return
     *     possible object is
     *     {@link OrigPub }
     *     
     */
    public OrigPub getOrigPub() {
        return origPub;
    }

    /**
     * Sets the value of the origPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigPub }
     *     
     */
    public void setOrigPub(OrigPub value) {
        this.origPub = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link Isbn }
     *     
     */
    public Isbn getIsbn() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Isbn }
     *     
     */
    public void setIsbn(Isbn value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the accessionNum property.
     * 
     * @return
     *     possible object is
     *     {@link AccessionNum }
     *     
     */
    public AccessionNum getAccessionNum() {
        return accessionNum;
    }

    /**
     * Sets the value of the accessionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessionNum }
     *     
     */
    public void setAccessionNum(AccessionNum value) {
        this.accessionNum = value;
    }

    /**
     * Gets the value of the callNum property.
     * 
     * @return
     *     possible object is
     *     {@link CallNum }
     *     
     */
    public CallNum getCallNum() {
        return callNum;
    }

    /**
     * Sets the value of the callNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallNum }
     *     
     */
    public void setCallNum(CallNum value) {
        this.callNum = value;
    }

    /**
     * Gets the value of the reportId property.
     * 
     * @return
     *     possible object is
     *     {@link ReportId }
     *     
     */
    public ReportId getReportId() {
        return reportId;
    }

    /**
     * Sets the value of the reportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportId }
     *     
     */
    public void setReportId(ReportId value) {
        this.reportId = value;
    }

    /**
     * Gets the value of the coden property.
     * 
     * @return
     *     possible object is
     *     {@link Coden }
     *     
     */
    public Coden getCoden() {
        return coden;
    }

    /**
     * Sets the value of the coden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coden }
     *     
     */
    public void setCoden(Coden value) {
        this.coden = value;
    }

    /**
     * Gets the value of the electronicResourceNum property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicResourceNum }
     *     
     */
    public ElectronicResourceNum getElectronicResourceNum() {
        return electronicResourceNum;
    }

    /**
     * Sets the value of the electronicResourceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicResourceNum }
     *     
     */
    public void setElectronicResourceNum(ElectronicResourceNum value) {
        this.electronicResourceNum = value;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link Abstract }
     *     
     */
    public Abstract getAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Abstract }
     *     
     */
    public void setAbstract(Abstract value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setLabel(Label value) {
        this.label = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setImage(Image value) {
        this.image = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link Caption }
     *     
     */
    public Caption getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Caption }
     *     
     */
    public void setCaption(Caption value) {
        this.caption = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Notes }
     *     
     */
    public Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notes }
     *     
     */
    public void setNotes(Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the researchNotes property.
     * 
     * @return
     *     possible object is
     *     {@link ResearchNotes }
     *     
     */
    public ResearchNotes getResearchNotes() {
        return researchNotes;
    }

    /**
     * Sets the value of the researchNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResearchNotes }
     *     
     */
    public void setResearchNotes(ResearchNotes value) {
        this.researchNotes = value;
    }

    /**
     * Gets the value of the workType property.
     * 
     * @return
     *     possible object is
     *     {@link WorkType }
     *     
     */
    public WorkType getWorkType() {
        return workType;
    }

    /**
     * Sets the value of the workType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkType }
     *     
     */
    public void setWorkType(WorkType value) {
        this.workType = value;
    }

    /**
     * Gets the value of the reviewedItem property.
     * 
     * @return
     *     possible object is
     *     {@link ReviewedItem }
     *     
     */
    public ReviewedItem getReviewedItem() {
        return reviewedItem;
    }

    /**
     * Sets the value of the reviewedItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewedItem }
     *     
     */
    public void setReviewedItem(ReviewedItem value) {
        this.reviewedItem = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link Availability }
     *     
     */
    public Availability getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Availability }
     *     
     */
    public void setAvailability(Availability value) {
        this.availability = value;
    }

    /**
     * Gets the value of the remoteSource property.
     * 
     * @return
     *     possible object is
     *     {@link RemoteSource }
     *     
     */
    public RemoteSource getRemoteSource() {
        return remoteSource;
    }

    /**
     * Sets the value of the remoteSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoteSource }
     *     
     */
    public void setRemoteSource(RemoteSource value) {
        this.remoteSource = value;
    }

    /**
     * Gets the value of the meetingPlace property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingPlace }
     *     
     */
    public MeetingPlace getMeetingPlace() {
        return meetingPlace;
    }

    /**
     * Sets the value of the meetingPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingPlace }
     *     
     */
    public void setMeetingPlace(MeetingPlace value) {
        this.meetingPlace = value;
    }

    /**
     * Gets the value of the workLocation property.
     * 
     * @return
     *     possible object is
     *     {@link WorkLocation }
     *     
     */
    public WorkLocation getWorkLocation() {
        return workLocation;
    }

    /**
     * Sets the value of the workLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkLocation }
     *     
     */
    public void setWorkLocation(WorkLocation value) {
        this.workLocation = value;
    }

    /**
     * Gets the value of the workExtent property.
     * 
     * @return
     *     possible object is
     *     {@link WorkExtent }
     *     
     */
    public WorkExtent getWorkExtent() {
        return workExtent;
    }

    /**
     * Sets the value of the workExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkExtent }
     *     
     */
    public void setWorkExtent(WorkExtent value) {
        this.workExtent = value;
    }

    /**
     * Gets the value of the packMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PackMethod }
     *     
     */
    public PackMethod getPackMethod() {
        return packMethod;
    }

    /**
     * Sets the value of the packMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackMethod }
     *     
     */
    public void setPackMethod(PackMethod value) {
        this.packMethod = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Size }
     *     
     */
    public Size getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Size }
     *     
     */
    public void setSize(Size value) {
        this.size = value;
    }

    /**
     * Gets the value of the reproRatio property.
     * 
     * @return
     *     possible object is
     *     {@link ReproRatio }
     *     
     */
    public ReproRatio getReproRatio() {
        return reproRatio;
    }

    /**
     * Sets the value of the reproRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReproRatio }
     *     
     */
    public void setReproRatio(ReproRatio value) {
        this.reproRatio = value;
    }

    /**
     * Gets the value of the remoteDatabaseName property.
     * 
     * @return
     *     possible object is
     *     {@link RemoteDatabaseName }
     *     
     */
    public RemoteDatabaseName getRemoteDatabaseName() {
        return remoteDatabaseName;
    }

    /**
     * Sets the value of the remoteDatabaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoteDatabaseName }
     *     
     */
    public void setRemoteDatabaseName(RemoteDatabaseName value) {
        this.remoteDatabaseName = value;
    }

    /**
     * Gets the value of the remoteDatabaseProvider property.
     * 
     * @return
     *     possible object is
     *     {@link RemoteDatabaseProvider }
     *     
     */
    public RemoteDatabaseProvider getRemoteDatabaseProvider() {
        return remoteDatabaseProvider;
    }

    /**
     * Sets the value of the remoteDatabaseProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoteDatabaseProvider }
     *     
     */
    public void setRemoteDatabaseProvider(RemoteDatabaseProvider value) {
        this.remoteDatabaseProvider = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLanguage(Language value) {
        this.language = value;
    }

    /**
     * Gets the value of the urls property.
     * 
     * @return
     *     possible object is
     *     {@link Urls }
     *     
     */
    public Urls getUrls() {
        return urls;
    }

    /**
     * Sets the value of the urls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Urls }
     *     
     */
    public void setUrls(Urls value) {
        this.urls = value;
    }

    /**
     * Gets the value of the accessDate property.
     * 
     * @return
     *     possible object is
     *     {@link AccessDate }
     *     
     */
    public AccessDate getAccessDate() {
        return accessDate;
    }

    /**
     * Sets the value of the accessDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessDate }
     *     
     */
    public void setAccessDate(AccessDate value) {
        this.accessDate = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link ModifiedDate }
     *     
     */
    public ModifiedDate getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifiedDate }
     *     
     */
    public void setModifiedDate(ModifiedDate value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the custom1 property.
     * 
     * @return
     *     possible object is
     *     {@link Custom1 }
     *     
     */
    public Custom1 getCustom1() {
        return custom1;
    }

    /**
     * Sets the value of the custom1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Custom1 }
     *     
     */
    public void setCustom1(Custom1 value) {
        this.custom1 = value;
    }

    /**
     * Gets the value of the custom2 property.
     * 
     * @return
     *     possible object is
     *     {@link Custom2 }
     *     
     */
    public Custom2 getCustom2() {
        return custom2;
    }

    /**
     * Sets the value of the custom2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Custom2 }
     *     
     */
    public void setCustom2(Custom2 value) {
        this.custom2 = value;
    }

    /**
     * Gets the value of the custom3 property.
     * 
     * @return
     *     possible object is
     *     {@link Custom3 }
     *     
     */
    public Custom3 getCustom3() {
        return custom3;
    }

    /**
     * Sets the value of the custom3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Custom3 }
     *     
     */
    public void setCustom3(Custom3 value) {
        this.custom3 = value;
    }

    /**
     * Gets the value of the custom4 property.
     * 
     * @return
     *     possible object is
     *     {@link Custom4 }
     *     
     */
    public Custom4 getCustom4() {
        return custom4;
    }

    /**
     * Sets the value of the custom4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Custom4 }
     *     
     */
    public void setCustom4(Custom4 value) {
        this.custom4 = value;
    }

    /**
     * Gets the value of the custom5 property.
     * 
     * @return
     *     possible object is
     *     {@link Custom5 }
     *     
     */
    public Custom5 getCustom5() {
        return custom5;
    }

    /**
     * Sets the value of the custom5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Custom5 }
     *     
     */
    public void setCustom5(Custom5 value) {
        this.custom5 = value;
    }

    /**
     * Gets the value of the custom6 property.
     * 
     * @return
     *     possible object is
     *     {@link Custom6 }
     *     
     */
    public Custom6 getCustom6() {
        return custom6;
    }

    /**
     * Sets the value of the custom6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Custom6 }
     *     
     */
    public void setCustom6(Custom6 value) {
        this.custom6 = value;
    }

    /**
     * Gets the value of the custom7 property.
     * 
     * @return
     *     possible object is
     *     {@link Custom7 }
     *     
     */
    public Custom7 getCustom7() {
        return custom7;
    }

    /**
     * Sets the value of the custom7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Custom7 }
     *     
     */
    public void setCustom7(Custom7 value) {
        this.custom7 = value;
    }

    /**
     * Gets the value of the misc1 property.
     * 
     * @return
     *     possible object is
     *     {@link Misc1 }
     *     
     */
    public Misc1 getMisc1() {
        return misc1;
    }

    /**
     * Sets the value of the misc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Misc1 }
     *     
     */
    public void setMisc1(Misc1 value) {
        this.misc1 = value;
    }

    /**
     * Gets the value of the misc2 property.
     * 
     * @return
     *     possible object is
     *     {@link Misc2 }
     *     
     */
    public Misc2 getMisc2() {
        return misc2;
    }

    /**
     * Sets the value of the misc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Misc2 }
     *     
     */
    public void setMisc2(Misc2 value) {
        this.misc2 = value;
    }

    /**
     * Gets the value of the misc3 property.
     * 
     * @return
     *     possible object is
     *     {@link Misc3 }
     *     
     */
    public Misc3 getMisc3() {
        return misc3;
    }

    /**
     * Sets the value of the misc3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Misc3 }
     *     
     */
    public void setMisc3(Misc3 value) {
        this.misc3 = value;
    }

}
