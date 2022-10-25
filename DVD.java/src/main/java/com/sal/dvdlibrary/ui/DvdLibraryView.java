package com.sal.dvdlibrary.ui;

import com.sal.dvdlibrary.dao.DvdLibraryDaoException;
import com.sal.dvdlibrary.dao.dvdLibraryDao;
import com.sal.dvdlibrary.dto.DvD;

import java.time.LocalDate;
import java.util.List;


public class DvdLibraryView implements dvdLibraryDao {

    private UserIO io;

    public DvdLibraryView(UserIO io) {

        this.io = io;
    }

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List DVD Title");
        io.print("2. Create New DVD");
        io.print("3. View a DVD");
        io.print("4. Remove a DVD");
        io.print("5. Edit a DVD");
        io.print("6. Exit");

        return io.readInt("Please select from the above choices", 1,6);
        //implement
    }
    public int printEditMenuAndGetSelection() {
        io.print("Which field do you want to change?");
        io.print("Edit Dvd menu");
        io.print("1. Release date");
        io.print("2. MPAA rating");
        io.print("3. Director's Name");
        io.print("4. User Rating");
        io.print("5. Studio Name");
        io.print("6. Exit edit menu");

        return io.readInt("Please select from the above choices.", 1,6);
        //implement
    }
    /*
     This method prompts the user for dvd ID, First Name, Last Name, and Cohort,
    gathers this information, creates a new dvd object, and returns it to the caller.
     */
    public DvD getNewDvDInfo() {
        String title = io.readString("Please enter the DVD title");
        String releaseDate = io.readString("Please enter the DVD release date");
        String MpaaRating = io.readString("Please enter the MPAA rating");
        String directorName = io.readString("Please enter the director's Name");
        String userRating = io.readString("Please enter the rating of the DVD");
        String studio = io.readString("Please enter the DVD studio");

        DvD currentDvd = new DvD(title);
        currentDvd.setReleaseDate(releaseDate);
        currentDvd.setMPAA(MpaaRating);
        currentDvd.setDirectorsName(directorName);
        currentDvd.setUserRating(userRating);
        currentDvd.setStudio(studio);
        return currentDvd;
        //implement
    }

    /*
    This method simply displays a banner or heading to the UI indicating that
    the next interactions on the screen will be for creating a new dvd
     */
    public void displayCreateDvDBanner() {

        io.print("=== Create DvD ===");
    }

    /*
    The second method displays a message that the new dvd was successfully created
    and waits for the user to hit Enter to continue
     */
    public void displayCreateSuccessBanner() {
        io.readString(
                "DvD successfully created.  Please hit enter to continue");
    }

    /*
    A method that takes a list of DVD objects as a parameter and displays the information for each Dvd to the screen.
     */
    public void displayDvdList(List<DvD> dvdList) {
        for (DvD currentDvd : dvdList) {
            String dvdInfo = String.format("%s : %s, %s, %s, %s, %s",
                    currentDvd.getTitle(),
                    currentDvd.getReleaseDate(),
                    currentDvd.getMPAA(),
                    currentDvd.getDirectorsName(),
                    currentDvd.getUserRating(),
                    currentDvd.getStudio());
            io.print(dvdInfo);
        }
        io.readString("Please hit enter to continue");
        //implement
    }

    public void displayDisplayAllBanner() {

        io.print("=== Display All Dvds ===");
    }

    /*
    Shows the student banner
     */
    public void displayDisplayDvdBanner() {

        io.print("=== Display Dvd ===");
    }

    /*
    Get the dvd title to display information
     */
    public String getDvdTitleChoice() {

        return io.readString("Please enter the dvd title.");
    }

    /*
    Displays the dvd information
     */
    public void displayDvd(DvD dvd) {
        if (dvd != null) {
            String dvdInfo = String.format("%s : %s, %s, %s, %s, %s",
                    dvd.getTitle(),
            dvd.getReleaseDate(),
            dvd.getMPAA(),
            dvd.getDirectorsName(),
            dvd.getUserRating(),
            dvd.getStudio());
            io.print(dvdInfo);
        } else {
            io.print("No such DVD. ");
        }
        io.readString("Please hit enter to continue.");
        //implement
    }

    public void displayRemoveDvdBanner() {
        io.print("=== Remove Dvd ===");
    }

    public void displayRemoveResult(DvD dvdRecord) {
        if (dvdRecord != null) {
        io.print("DVD successfully removed.");
    } else {
            io.print("No such DVD.");
        }
        io.readString("Please hit enter to continue.");
        //implement
    }

    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
    public void displayEditDvdBanner() {
        io.print("=== Edit DVD ===");
    }

    public void displayEditDvdSuccess() {
        io.readString(
                "DVD successfully Edited.  Please hit enter to continue");
    }

    public void displayEditReleaseDateBanner() {
        io.print("=== Edit DVD Release Date ===");
    }

    public void displayEditMpaaBanner() {
        io.print("=== Edit DVD MPAA rating ===");
    }

    public void displayEditDirectorNameBanner() {
        io.print("=== Edit DVD Director's Name ===");
    }

    public void displayEditStudio() {
        io.print("=== Edit DVD Studio ===");
    }

    public void displayEditUserRating() {
        io.print("=== Edit DVD User Rating ===");
    }

    public String getNewReleaseDate() {
        return io.readString("Please enter new release date.");
    }

    public String getNewMpaaRating() {
        return io.readString("Please enter new MPAA rating.");
    }

    public String getNewDirectorName() {
        return io.readString("Please enter new director's name.");
    }

    public String getNewUserRating() {
        return io.readString("Please enter new user rating.");
    }

    public String getNewStudio() {
        return io.readString("Please enter new studio.");
    }

    public void displayNullDVD() {
        io.print("No such DVD.");
        io.readString("Please hit enter to continue.");
    }

    public void displayCreateDvdBanner() {
    }

    public DvD getNewDvdInfo() {

        return null;
    }

    public void displayDvdListBanner() {
    }

    @Override
    public DvD addDvd(String title, DvD dvd) throws DvdLibraryDaoException {
        //return null;
        return dvd;
    }

    @Override
    public List<DvD> getAllDvds() throws DvdLibraryDaoException {
        return null;
    }

    @Override
    public DvD getDvd(String title) throws DvdLibraryDaoException {
        return null;
    }

    @Override
    public DvD removeDvd(String title) throws DvdLibraryDaoException {
        return null;
    }

    @Override
    public DvD editReleaseDate(String title, String newReleaseDate) throws DvdLibraryDaoException {
        return null;
    }

    @Override
    public DvD editMPAA(String title, String newMpaaRating) throws DvdLibraryDaoException {
        return null;
    }

    @Override
    public DvD editDirectorName(String title, String newDirectorName) throws DvdLibraryDaoException {
        return null;
    }

    @Override
    public DvD editUserRating(String title, String newUserRating) throws DvdLibraryDaoException {
        return null;
    }

    @Override
    public DvD editStudio(String title, String newStudioName) throws DvdLibraryDaoException {
        return null;
    }

    //public void displayDvd(DvD dvd) {
    //}
}
