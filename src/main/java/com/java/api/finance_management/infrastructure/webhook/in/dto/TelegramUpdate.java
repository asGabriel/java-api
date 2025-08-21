package com.java.api.finance_management.infrastructure.webhook.in.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TelegramUpdate {

    @JsonProperty("update_id")
    private Long updateId;

    private Message message;

    @JsonProperty("edited_message")
    private Message editedMessage;

    @JsonProperty("channel_post")
    private Message channelPost;

    @JsonProperty("edited_channel_post")
    private Message editedChannelPost;

    @JsonProperty("inline_query")
    private JsonNode inlineQuery;

    @JsonProperty("chosen_inline_result")
    private JsonNode chosenInlineResult;

    @JsonProperty("callback_query")
    private JsonNode callbackQuery;

    @JsonProperty("shipping_query")
    private JsonNode shippingQuery;

    @JsonProperty("pre_checkout_query")
    private JsonNode preCheckoutQuery;

    private Poll poll;

    @JsonProperty("poll_answer")
    private JsonNode pollAnswer;

    @JsonProperty("my_chat_member")
    private ChatMemberUpdated myChatMember;

    @JsonProperty("chat_member")
    private ChatMemberUpdated chatMember;

    @JsonProperty("chat_join_request")
    private JsonNode chatJoinRequest;

    @JsonProperty("business_connection")
    private JsonNode businessConnection;

    @JsonProperty("business_message")
    private Message businessMessage;

    @JsonProperty("edited_business_message")
    private Message editedBusinessMessage;

    @JsonProperty("deleted_business_messages")
    private JsonNode deletedBusinessMessages;

    @JsonProperty("message_reaction")
    private JsonNode messageReaction;

    @JsonProperty("message_reaction_count")
    private JsonNode messageReactionCount;

    @JsonProperty("chat_boost")
    private JsonNode chatBoost;

    @JsonProperty("removed_chat_boost")
    private JsonNode removedChatBoost;

    public Long getUpdateId() { return updateId; }
    public Message getMessage() { return message; }
    public Message getEditedMessage() { return editedMessage; }
    public Message getChannelPost() { return channelPost; }
    public Message getEditedChannelPost() { return editedChannelPost; }
    public JsonNode getInlineQuery() { return inlineQuery; }
    public JsonNode getChosenInlineResult() { return chosenInlineResult; }
    public JsonNode getCallbackQuery() { return callbackQuery; }
    public JsonNode getShippingQuery() { return shippingQuery; }
    public JsonNode getPreCheckoutQuery() { return preCheckoutQuery; }
    public Poll getPoll() { return poll; }
    public JsonNode getPollAnswer() { return pollAnswer; }
    public ChatMemberUpdated getMyChatMember() { return myChatMember; }
    public ChatMemberUpdated getChatMember() { return chatMember; }
    public JsonNode getChatJoinRequest() { return chatJoinRequest; }
    public JsonNode getBusinessConnection() { return businessConnection; }
    public Message getBusinessMessage() { return businessMessage; }
    public Message getEditedBusinessMessage() { return editedBusinessMessage; }
    public JsonNode getDeletedBusinessMessages() { return deletedBusinessMessages; }
    public JsonNode getMessageReaction() { return messageReaction; }
    public JsonNode getMessageReactionCount() { return messageReactionCount; }
    public JsonNode getChatBoost() { return chatBoost; }
    public JsonNode getRemovedChatBoost() { return removedChatBoost; }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Message {
        @JsonProperty("message_id")
        private Long messageId;
        private User from;
        private Chat chat;
        private Integer date;

        @JsonProperty("reply_to_message")
        private Message replyToMessage;

        private String text;
        private List<MessageEntity> entities;
        private String caption;
        @JsonProperty("caption_entities")
        private List<MessageEntity> captionEntities;

        private List<PhotoSize> photo;
        private Document document;
        private Animation animation;
        private Audio audio;
        private Video video;
        @JsonProperty("video_note")
        private VideoNote videoNote;
        private Voice voice;
        private Sticker sticker;

        private Contact contact;
        private Location location;
        private Venue venue;
        private Dice dice;
        private Poll poll;

        private JsonNode json;

        public Long getMessageId() { return messageId; }
        public User getFrom() { return from; }
        public Chat getChat() { return chat; }
        public Integer getDate() { return date; }
        public Message getReplyToMessage() { return replyToMessage; }
        public String getText() { return text; }
        public List<MessageEntity> getEntities() { return entities; }
        public String getCaption() { return caption; }
        public List<MessageEntity> getCaptionEntities() { return captionEntities; }
        public List<PhotoSize> getPhoto() { return photo; }
        public Document getDocument() { return document; }
        public Animation getAnimation() { return animation; }
        public Audio getAudio() { return audio; }
        public Video getVideo() { return video; }
        public VideoNote getVideoNote() { return videoNote; }
        public Voice getVoice() { return voice; }
        public Sticker getSticker() { return sticker; }
        public Contact getContact() { return contact; }
        public Location getLocation() { return location; }
        public Venue getVenue() { return venue; }
        public Dice getDice() { return dice; }
        public Poll getPoll() { return poll; }
        public JsonNode getJson() { return json; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Chat {
        private Long id;
        private String type;
        private String title;
        private String username;
        @JsonProperty("first_name")
        private String firstName;
        @JsonProperty("last_name")
        private String lastName;
        private JsonNode json;
        public Long getId() { return id; }
        public String getType() { return type; }
        public String getTitle() { return title; }
        public String getUsername() { return username; }
        public String getFirstName() { return firstName; }
        public String getLastName() { return lastName; }
        public JsonNode getJson() { return json; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class User {
        private Long id;
        @JsonProperty("is_bot")
        private boolean isBot;
        @JsonProperty("first_name")
        private String firstName;
        @JsonProperty("last_name")
        private String lastName;
        private String username;
        @JsonProperty("language_code")
        private String languageCode;
        private JsonNode json;
        public Long getId() { return id; }
        public boolean isBot() { return isBot; }
        public String getFirstName() { return firstName; }
        public String getLastName() { return lastName; }
        public String getUsername() { return username; }
        public String getLanguageCode() { return languageCode; }
        public JsonNode getJson() { return json; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MessageEntity {
        private String type;
        private Integer offset;
        private Integer length;
        private String url;
        private User user;
        private String language;
        private JsonNode json;
        public String getType() { return type; }
        public Integer getOffset() { return offset; }
        public Integer getLength() { return length; }
        public String getUrl() { return url; }
        public User getUser() { return user; }
        public String getLanguage() { return language; }
        public JsonNode getJson() { return json; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PhotoSize {
        @JsonProperty("file_id")
        private String fileId;
        @JsonProperty("file_unique_id")
        private String fileUniqueId;
        private Integer width;
        private Integer height;
        @JsonProperty("file_size")
        private Integer fileSize;
        public String getFileId() { return fileId; }
        public String getFileUniqueId() { return fileUniqueId; }
        public Integer getWidth() { return width; }
        public Integer getHeight() { return height; }
        public Integer getFileSize() { return fileSize; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Animation {
        @JsonProperty("file_id")
        private String fileId;
        @JsonProperty("file_unique_id")
        private String fileUniqueId;
        private Integer width;
        private Integer height;
        private Integer duration;
        private PhotoSize thumbnail;
        private String fileName;
        private String mimeType;
        private Integer fileSize;
        public String getFileId() { return fileId; }
        public String getFileUniqueId() { return fileUniqueId; }
        public Integer getWidth() { return width; }
        public Integer getHeight() { return height; }
        public Integer getDuration() { return duration; }
        @JsonProperty("thumbnail")
        public PhotoSize getThumbnail() { return thumbnail; }
        public String getFileName() { return fileName; }
        public String getMimeType() { return mimeType; }
        public Integer getFileSize() { return fileSize; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Audio {
        @JsonProperty("file_id")
        private String fileId;
        @JsonProperty("file_unique_id")
        private String fileUniqueId;
        private Integer duration;
        private String performer;
        private String title;
        private String fileName;
        private String mimeType;
        private Integer fileSize;
        public String getFileId() { return fileId; }
        public String getFileUniqueId() { return fileUniqueId; }
        public Integer getDuration() { return duration; }
        public String getPerformer() { return performer; }
        public String getTitle() { return title; }
        public String getFileName() { return fileName; }
        public String getMimeType() { return mimeType; }
        public Integer getFileSize() { return fileSize; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Document {
        @JsonProperty("file_id")
        private String fileId;
        @JsonProperty("file_unique_id")
        private String fileUniqueId;
        private PhotoSize thumbnail;
        private String fileName;
        private String mimeType;
        private Integer fileSize;
        public String getFileId() { return fileId; }
        public String getFileUniqueId() { return fileUniqueId; }
        public PhotoSize getThumbnail() { return thumbnail; }
        public String getFileName() { return fileName; }
        public String getMimeType() { return mimeType; }
        public Integer getFileSize() { return fileSize; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Video {
        @JsonProperty("file_id")
        private String fileId;
        @JsonProperty("file_unique_id")
        private String fileUniqueId;
        private Integer width;
        private Integer height;
        private Integer duration;
        private PhotoSize thumbnail;
        private String fileName;
        private String mimeType;
        private Integer fileSize;
        public String getFileId() { return fileId; }
        public String getFileUniqueId() { return fileUniqueId; }
        public Integer getWidth() { return width; }
        public Integer getHeight() { return height; }
        public Integer getDuration() { return duration; }
        public PhotoSize getThumbnail() { return thumbnail; }
        public String getFileName() { return fileName; }
        public String getMimeType() { return mimeType; }
        public Integer getFileSize() { return fileSize; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class VideoNote {
        @JsonProperty("file_id")
        private String fileId;
        @JsonProperty("file_unique_id")
        private String fileUniqueId;
        private Integer length;
        private Integer duration;
        private PhotoSize thumbnail;
        private Integer fileSize;
        public String getFileId() { return fileId; }
        public String getFileUniqueId() { return fileUniqueId; }
        public Integer getLength() { return length; }
        public Integer getDuration() { return duration; }
        public PhotoSize getThumbnail() { return thumbnail; }
        public Integer getFileSize() { return fileSize; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Voice {
        @JsonProperty("file_id")
        private String fileId;
        @JsonProperty("file_unique_id")
        private String fileUniqueId;
        private Integer duration;
        private String mimeType;
        private Integer fileSize;
        public String getFileId() { return fileId; }
        public String getFileUniqueId() { return fileUniqueId; }
        public Integer getDuration() { return duration; }
        public String getMimeType() { return mimeType; }
        public Integer getFileSize() { return fileSize; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Sticker {
        @JsonProperty("file_id")
        private String fileId;
        @JsonProperty("file_unique_id")
        private String fileUniqueId;
        private String type;
        private PhotoSize thumbnail;
        private String emoji;
        @JsonProperty("set_name")
        private String setName;
        public String getFileId() { return fileId; }
        public String getFileUniqueId() { return fileUniqueId; }
        public String getType() { return type; }
        public PhotoSize getThumbnail() { return thumbnail; }
        public String getEmoji() { return emoji; }
        public String getSetName() { return setName; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Contact {
        @JsonProperty("phone_number")
        private String phoneNumber;
        @JsonProperty("first_name")
        private String firstName;
        @JsonProperty("last_name")
        private String lastName;
        private Long userId;
        private String vcard;
        public String getPhoneNumber() { return phoneNumber; }
        public String getFirstName() { return firstName; }
        public String getLastName() { return lastName; }
        public Long getUserId() { return userId; }
        public String getVcard() { return vcard; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Location {
        private Double longitude;
        private Double latitude;
        public Double getLongitude() { return longitude; }
        public Double getLatitude() { return latitude; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Venue {
        private Location location;
        private String title;
        private String address;
        @JsonProperty("foursquare_id")
        private String foursquareId;
        public Location getLocation() { return location; }
        public String getTitle() { return title; }
        public String getAddress() { return address; }
        public String getFoursquareId() { return foursquareId; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Dice {
        private Integer value;
        public Integer getValue() { return value; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Poll {
        private String id;
        private String question;
        private List<PollOption> options;
        @JsonProperty("is_closed")
        private boolean isClosed;
        public String getId() { return id; }
        public String getQuestion() { return question; }
        public List<PollOption> getOptions() { return options; }
        public boolean isClosed() { return isClosed; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PollOption {
        private String text;
        @JsonProperty("voter_count")
        private Integer voterCount;
        public String getText() { return text; }
        public Integer getVoterCount() { return voterCount; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ChatMemberUpdated {
        private Chat chat;
        private User from;
        private Integer date;
        @JsonProperty("old_chat_member")
        private JsonNode oldChatMember;
        @JsonProperty("new_chat_member")
        private JsonNode newChatMember;
        private JsonNode json;
        public Chat getChat() { return chat; }
        public User getFrom() { return from; }
        public Integer getDate() { return date; }
        public JsonNode getOldChatMember() { return oldChatMember; }
        public JsonNode getNewChatMember() { return newChatMember; }
        public JsonNode getJson() { return json; }
    }
}
