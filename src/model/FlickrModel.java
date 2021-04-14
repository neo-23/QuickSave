package quickSave.model;

import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.RequestContext;
import com.flickr4java.flickr.auth.Auth;
import com.flickr4java.flickr.auth.Permission;
import com.flickr4java.flickr.photos.Photo;
import com.flickr4java.flickr.photos.PhotoList;
import com.flickr4java.flickr.photos.PhotosInterface;
import com.flickr4java.flickr.photos.SearchParameters;
import com.flickr4java.flickr.util.IOUtilities;

import java.io.Serializable;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlickrModel implements Serializable {

    private Flickr flickr;
    private REST rest;

    public FlickrModel() {
    }

    private String getKey() {
        return "c3d0839fa0f5d1141452729892f14900";
    }

    private String getSecret() {
        return "891637ec0eedab6c";
    }

    public PhotoList<Photo> search(String text) throws FlickrException {
        flickr = new Flickr(getKey(), getSecret(), new REST());
        PhotosInterface photos = flickr.getPhotosInterface();
        SearchParameters params = new SearchParameters();
        params.setMedia("photos");
        params.setExtras(Stream.of("media").collect(Collectors.toSet()));
        params.setText(text);

        return photos.search(params, 16, 0);
    }
}
