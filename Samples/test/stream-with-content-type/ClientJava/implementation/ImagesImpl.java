/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package streamwithcontenttype.implementation;

import retrofit2.Retrofit;
import .Images;
import .models.ContentType;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.InputStream;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Images.
 */
public class ImagesImpl implements Images {
    /** The Retrofit service to perform REST calls. */
    private ImagesService service;
    /** The service client containing this operation class. */
    private CowbellModeratorImpl client;

    /**
     * Initializes an instance of Images.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ImagesImpl(Retrofit retrofit, CowbellModeratorImpl client) {
        this.service = retrofit.create(ImagesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Images to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ImagesService {
        @Headers({ "Content-Type: image/gif", "x-ms-logging-context: .Images a" })
        @POST("ProcessImage/FunctionA")
        Observable<Response<ResponseBody>> a(@Body RequestBody image, @Header("Content-Type") ContentType imageContentType);

        @Headers({ "Content-Type: image/gif", "x-ms-logging-context: .Images b" })
        @POST("ProcessImage/FunctionB")
        Observable<Response<ResponseBody>> b(@Body RequestBody image, @Header("Content-Type") ContentType imageContentType);

    }

    /**
     *
     * @param image An image stream.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void a(byte[] image) {
        aWithServiceResponseAsync(image).toBlocking().single().body();
    }

    /**
     *
     * @param image An image stream.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> aAsync(byte[] image, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(aWithServiceResponseAsync(image), serviceCallback);
    }

    /**
     *
     * @param image An image stream.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> aAsync(byte[] image) {
        return aWithServiceResponseAsync(image).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     *
     * @param image An image stream.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> aWithServiceResponseAsync(byte[] image) {
        if (image == null) {
            throw new IllegalArgumentException("Parameter image is required and cannot be null.");
        }
        final ContentType imageContentType = null;
        RequestBody imageConverted = RequestBody.create(MediaType.parse("image/gif"), image);
        return service.a(imageConverted, imageContentType)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = aDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     *
     * @param image An image stream.
     * @param imageContentType The content type of the image. Possible values include: 'image/gif', 'image/jpeg', 'image/png', 'image/bmp', 'image/tiff'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void a(byte[] image, ContentType imageContentType) {
        aWithServiceResponseAsync(image, imageContentType).toBlocking().single().body();
    }

    /**
     *
     * @param image An image stream.
     * @param imageContentType The content type of the image. Possible values include: 'image/gif', 'image/jpeg', 'image/png', 'image/bmp', 'image/tiff'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> aAsync(byte[] image, ContentType imageContentType, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(aWithServiceResponseAsync(image, imageContentType), serviceCallback);
    }

    /**
     *
     * @param image An image stream.
     * @param imageContentType The content type of the image. Possible values include: 'image/gif', 'image/jpeg', 'image/png', 'image/bmp', 'image/tiff'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> aAsync(byte[] image, ContentType imageContentType) {
        return aWithServiceResponseAsync(image, imageContentType).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     *
     * @param image An image stream.
     * @param imageContentType The content type of the image. Possible values include: 'image/gif', 'image/jpeg', 'image/png', 'image/bmp', 'image/tiff'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> aWithServiceResponseAsync(byte[] image, ContentType imageContentType) {
        if (image == null) {
            throw new IllegalArgumentException("Parameter image is required and cannot be null.");
        }
        RequestBody imageConverted = RequestBody.create(MediaType.parse("image/gif"), image);
        return service.a(imageConverted, imageContentType)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = aDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> aDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     *
     * @param image An image stream.
     * @param imageContentType The content type of the image. Possible values include: 'image/gif', 'image/jpeg', 'image/png', 'image/bmp', 'image/tiff'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void b(byte[] image, ContentType imageContentType) {
        bWithServiceResponseAsync(image, imageContentType).toBlocking().single().body();
    }

    /**
     *
     * @param image An image stream.
     * @param imageContentType The content type of the image. Possible values include: 'image/gif', 'image/jpeg', 'image/png', 'image/bmp', 'image/tiff'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> bAsync(byte[] image, ContentType imageContentType, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(bWithServiceResponseAsync(image, imageContentType), serviceCallback);
    }

    /**
     *
     * @param image An image stream.
     * @param imageContentType The content type of the image. Possible values include: 'image/gif', 'image/jpeg', 'image/png', 'image/bmp', 'image/tiff'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> bAsync(byte[] image, ContentType imageContentType) {
        return bWithServiceResponseAsync(image, imageContentType).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     *
     * @param image An image stream.
     * @param imageContentType The content type of the image. Possible values include: 'image/gif', 'image/jpeg', 'image/png', 'image/bmp', 'image/tiff'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> bWithServiceResponseAsync(byte[] image, ContentType imageContentType) {
        if (image == null) {
            throw new IllegalArgumentException("Parameter image is required and cannot be null.");
        }
        if (imageContentType == null) {
            throw new IllegalArgumentException("Parameter imageContentType is required and cannot be null.");
        }
        RequestBody imageConverted = RequestBody.create(MediaType.parse("image/gif"), image);
        return service.b(imageConverted, imageContentType)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = bDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> bDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}